/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mycompany.myapp.dto;

import com.mycompany.myapp.dao.*;
import com.mycompany.myapp.factory.*;
import com.mycompany.myapp.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Automovil implements Serializable
{
	/** 
	 * This attribute maps to the column tipo in the automovil table.
	 */
	protected String tipo;

	/** 
	 * This attribute maps to the column marca in the automovil table.
	 */
	protected String marca;

	/** 
	 * This attribute maps to the column modelo in the automovil table.
	 */
	protected String modelo;

	/** 
	 * This attribute maps to the column año in the automovil table.
	 */
	protected int año;

	/** 
	 * This attribute represents whether the primitive attribute año is null.
	 */
	protected boolean añoNull = true;

	/** 
	 * This attribute maps to the column color in the automovil table.
	 */
	protected String color;

	/** 
	 * This attribute maps to the column precio in the automovil table.
	 */
	protected float precio;

	/** 
	 * This attribute represents whether the primitive attribute precio is null.
	 */
	protected boolean precioNull = true;

	/**
	 * Method 'Automovil'
	 * 
	 */
	public Automovil()
	{
	}

	/**
	 * Method 'getTipo'
	 * 
	 * @return String
	 */
	public String getTipo()
	{
		return tipo;
	}

	/**
	 * Method 'setTipo'
	 * 
	 * @param tipo
	 */
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	/**
	 * Method 'getMarca'
	 * 
	 * @return String
	 */
	public String getMarca()
	{
		return marca;
	}

	/**
	 * Method 'setMarca'
	 * 
	 * @param marca
	 */
	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	/**
	 * Method 'getModelo'
	 * 
	 * @return String
	 */
	public String getModelo()
	{
		return modelo;
	}

	/**
	 * Method 'setModelo'
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	/**
	 * Method 'getAño'
	 * 
	 * @return int
	 */
	public int getAño()
	{
		return año;
	}

	/**
	 * Method 'setAño'
	 * 
	 * @param año
	 */
	public void setAño(int año)
	{
		this.año = año;
		this.añoNull = false;
	}

	/**
	 * Method 'setAñoNull'
	 * 
	 * @param value
	 */
	public void setAñoNull(boolean value)
	{
		this.añoNull = value;
	}

	/**
	 * Method 'isAñoNull'
	 * 
	 * @return boolean
	 */
	public boolean isAñoNull()
	{
		return añoNull;
	}

	/**
	 * Method 'getColor'
	 * 
	 * @return String
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * Method 'setColor'
	 * 
	 * @param color
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * Method 'getPrecio'
	 * 
	 * @return float
	 */
	public float getPrecio()
	{
		return precio;
	}

	/**
	 * Method 'setPrecio'
	 * 
	 * @param precio
	 */
	public void setPrecio(float precio)
	{
		this.precio = precio;
		this.precioNull = false;
	}

	/**
	 * Method 'setPrecioNull'
	 * 
	 * @param value
	 */
	public void setPrecioNull(boolean value)
	{
		this.precioNull = value;
	}

	/**
	 * Method 'isPrecioNull'
	 * 
	 * @return boolean
	 */
	public boolean isPrecioNull()
	{
		return precioNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof Automovil)) {
			return false;
		}
		
		final Automovil _cast = (Automovil) _other;
		if (tipo == null ? _cast.tipo != tipo : !tipo.equals( _cast.tipo )) {
			return false;
		}
		
		if (marca == null ? _cast.marca != marca : !marca.equals( _cast.marca )) {
			return false;
		}
		
		if (modelo == null ? _cast.modelo != modelo : !modelo.equals( _cast.modelo )) {
			return false;
		}
		
		if (año != _cast.año) {
			return false;
		}
		
		if (añoNull != _cast.añoNull) {
			return false;
		}
		
		if (color == null ? _cast.color != color : !color.equals( _cast.color )) {
			return false;
		}
		
		if (precio != _cast.precio) {
			return false;
		}
		
		if (precioNull != _cast.precioNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (tipo != null) {
			_hashCode = 29 * _hashCode + tipo.hashCode();
		}
		
		if (marca != null) {
			_hashCode = 29 * _hashCode + marca.hashCode();
		}
		
		if (modelo != null) {
			_hashCode = 29 * _hashCode + modelo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + año;
		_hashCode = 29 * _hashCode + (añoNull ? 1 : 0);
		if (color != null) {
			_hashCode = 29 * _hashCode + color.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(precio);
		_hashCode = 29 * _hashCode + (precioNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mycompany.myapp.dto.Automovil: " );
		ret.append( "tipo=" + tipo );
		ret.append( ", marca=" + marca );
		ret.append( ", modelo=" + modelo );
		ret.append( ", año=" + año );
		ret.append( ", color=" + color );
		ret.append( ", precio=" + precio );
		return ret.toString();
	}

}
