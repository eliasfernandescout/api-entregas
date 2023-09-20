//package com.apientregas.jpa;
//
//import com.apientregas.domain.model.Merchant;
//import org.springframework.stereotype.Component;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Component
//public class CreateMerchant {
//    @PersistenceContext
//    private EntityManager manager;
//
//    public List<Merchant> list() {
//        return manager.createQuery("from Merchant", Merchant.class).getResultList();
//    }
//
//    public  Merchant createMerchant(Merchant merchant){
//        return manager.merge(merchant);
//    }
//}
