/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author lab902
 */
@Entity
public class Inventory implements Serializable {
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String product_name;
    private Integer quantity;
    private Integer prize;
    public Integer getId() {
        return id;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory.Inventory[ id=" + id + " ]";
    }

    public String getProduct_name() {
        return product_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}
