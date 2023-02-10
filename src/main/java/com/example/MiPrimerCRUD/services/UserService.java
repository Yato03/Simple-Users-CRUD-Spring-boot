package com.example.MiPrimerCRUD.services;

import com.example.MiPrimerCRUD.models.Usuario;

public interface UserService {
    public Usuario saveUser(Usuario usuario);
    public Usuario getUser(Long idUser);
    public Usuario modifyUser(Long idUser, Usuario usuario);
    public boolean deleteUser(Long idUser);
}
