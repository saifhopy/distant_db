package com.example.distant_db;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;

public interface ContactsAPI {

    @GET("crud.php")
    Call<List<Contact>> getContacts();

    @GET("contacts/{id}")
    Call<Contact> getContactById(@Path("id") int id);

    @POST("contacts")
    Call<Contact> createContact(@Body Contact contact);

    @PUT("contacts/{id}")
    Call<Contact> updateContact(@Path("id") int id, @Body Contact contact);

    @DELETE("contacts/{id}")
    Call<Void> deleteContact(@Path("id") int id);
}

