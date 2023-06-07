package com.example.distant_db;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;

public interface ContactsAPI {

    @GET("crud.php")
    Call<List<Contact>> getContacts();
}

