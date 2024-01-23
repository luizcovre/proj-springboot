package com.projetospringboot.curso.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.projetospringboot.curso.entities.Order;
import com.projetospringboot.curso.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable{
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product produtc;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProdutc() {
		return produtc;
	}
	public void setProdutc(Product produtc) {
		this.produtc = produtc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, produtc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(produtc, other.produtc);
	}
	
	
}
