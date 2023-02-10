package com.example.MiPrimerCRUD.services;

import com.example.MiPrimerCRUD.models.Usuario;
import com.example.MiPrimerCRUD.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    @Override
    public Usuario saveUser(Usuario user) {
        return userRepository.save(user);
    }

    @Override
    public Usuario getUser(Long idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    @Override
    public Usuario modifyUser(Long idUser, Usuario user) {
        Usuario searchedUser = userRepository.findById(idUser).get();
        searchedUser.setAddress(user.getAddress());
        searchedUser.setTelephoneNumber(user.getTelephoneNumber());
        return userRepository.save(searchedUser);
    }

    @Override
    public boolean deleteUser(Long idUser) {
        try{
            userRepository.deleteById(idUser);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
