package com.market.openstore.dao.payement;

import com.market.openstore.entities.payement.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepo extends JpaRepository<Facture, Long> {
}
