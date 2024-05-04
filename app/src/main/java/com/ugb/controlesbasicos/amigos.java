package com.ugb.controlesbasicos;
public class amigos {
    String _id;
    String _rev;
    String idAmigo;
    String nombre;
    String descripcion;
    String marca;
    String presentacion;
    String precio;
    String urlFotoAmigo;
    String stock;

    String costo;

    public amigos(String _id, String _rev, String idAmigo, String nombre, String descripcion, String marca, String presentacion, String precio, String urlFoto, String stock, String costo) {
        this._id = _id;
        this._rev = _rev;
        this.idAmigo = idAmigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.presentacion = presentacion;
        this.precio = precio;
        this.urlFotoAmigo = urlFoto;
        this.stock = stock;
        this.costo = costo;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_rev() {
        return _rev;
    }
    public void set_rev(String _rev) {
        this._rev = _rev;
    }
    public String getUrlFotoAmigo() {
        return urlFotoAmigo;
    }

    public void setUrlFotoAmigo(String urlFotoAmigo) {
        this.urlFotoAmigo = urlFotoAmigo;
    }

    public String getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(String idAmigo) {
        this.idAmigo = idAmigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock(String stock){
        return stock;
    }

    public void setStock(String stock){
        this.stock = stock;
    }

    public String getSCosto(String costo){
        return costo;
    }

    public void setCosto(String costo){
        this.stock = costo;
    }
}