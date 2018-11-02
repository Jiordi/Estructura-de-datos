/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mycompany.myapp.dao;

import com.mycompany.myapp.dto.*;
import com.mycompany.myapp.exceptions.*;

public interface AutomovilDao
{
	/** 
	 * Inserts a new row in the automovil table.
	 */
	public void insert(Automovil dto) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria ''.
	 */
	public Automovil[] findAll() throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'tipo = :tipo'.
	 */
	public Automovil[] findWhereTipoEquals(String tipo) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'marca = :marca'.
	 */
	public Automovil[] findWhereMarcaEquals(String marca) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'modelo = :modelo'.
	 */
	public Automovil[] findWhereModeloEquals(String modelo) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'año = :año'.
	 */
	public Automovil[] findWhereAñoEquals(int año) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'color = :color'.
	 */
	public Automovil[] findWhereColorEquals(String color) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the criteria 'precio = :precio'.
	 */
	public Automovil[] findWherePrecioEquals(float precio) throws AutomovilDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the automovil table that match the specified arbitrary SQL statement
	 */
	public Automovil[] findByDynamicSelect(String sql, Object[] sqlParams) throws AutomovilDaoException;

	/** 
	 * Returns all rows from the automovil table that match the specified arbitrary SQL statement
	 */
	public Automovil[] findByDynamicWhere(String sql, Object[] sqlParams) throws AutomovilDaoException;

}
