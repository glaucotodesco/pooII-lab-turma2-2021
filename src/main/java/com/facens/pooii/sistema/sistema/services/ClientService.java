package com.facens.pooii.sistema.sistema.services;

import java.util.ArrayList;
import java.util.List;

import com.facens.pooii.sistema.sistema.dto.ClientDTO;
import com.facens.pooii.sistema.sistema.entities.Client;
import com.facens.pooii.sistema.sistema.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {


    @Autowired
    private ClientRepository repo;

    public List<ClientDTO> getClients(){
        
        List <Client>     list   = repo.findAll();
        List <ClientDTO> listDTO = new ArrayList<>();

        for(Client c: list){
            ClientDTO dto = new ClientDTO(c.getId(), c.getName());
            listDTO.add(dto);
        }
        
        
        return listDTO;
    }
    
}
