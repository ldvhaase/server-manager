package io.getarrays.server;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static io.getarrays.server.enumeration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.155", "Windows Server 2003", "50TB", "Office Mail Server", "http://localhost:8080/server/images/server-img-1.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.131", "Windows 10 PC", "1TB", "Personal Computer", "http://localhost:8080/server/images/server-img-2.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.240", "Ubuntu Linux", "500GB", "Work Laptop", "http://localhost:8080/server/images/server-img-3.png", SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.174", "Windows 10 Desktop", "8TB", "Video Editing Workstation", "http://localhost:8080/server/images/server-img-4.png", SERVER_UP));
		};
	}

}
