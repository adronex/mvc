package com.company.base;


import java.util.List;


public interface Repository<E, ID>
{
    List<E> findAll();


    E findById(ID id);


    void saveOrUpdate(E entity);


    void delete(ID id);
}
