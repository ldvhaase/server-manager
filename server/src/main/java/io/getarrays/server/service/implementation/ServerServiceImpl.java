package io.getarrays.server.service.implementation;

import java.util.Collection;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;
import io.getarrays.server.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
    
@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ServerServiceImpl implements ServerService {
    private final ServerRepo serverRepo;

    @Override
    public Server create(Server server) {
        log.info("Saving new server: {}", server.getName());
        server.setImageUrl(setServerImageUrl());
        return null;
    }

   

    @Override
    public Server ping(String ipAddress) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public Collection<Server> list(int limit) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Server get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Server update(Server server) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
    private String setServerImageUrl() {
        return null;
    }
}
