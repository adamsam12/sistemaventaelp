package elp.vs.sistemaventa.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

	@Column(name = "id_compra")
	private Integer idCompra;
	
	@Column(name = "id_producto")
	private Integer idProducto;
	
	private static final long serialVersionUID = 1L;

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	
	

}
