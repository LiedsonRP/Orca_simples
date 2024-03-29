/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orcasimples.model.entities;
import com.mycompany.orcasimples.model.memory.RecipeItem;
import com.mycompany.orcasimples.model.memory.Item;
import java.util.ArrayList;

/**
 * Classe que representa os insumos simples
 *
 * @author lieds
 */
public class SimpleFoodstock extends Item {

    /**
     * Quantidade comprada num pacote, embalagem e etc.
     */
    private double quant_purchased;
    /**
     * Valor pago pelo pacote, embalagem e etc comprada.
     */
    private double value_payed;
    /**
     * Custo unitário do insumos simples.
     */
    private double unit_cost;

    /**
     * Método construtor dos insumos simples
     *
     * @param name nome do insumos simples
     * @param type tipo de insumo simples
     * @param unit_measurement unidade de medida do insumo simples
     * @param quant_purchased Quantidade comprada do insumo composto
     * @param value_payed valor pago pela quantidade
     */
    public SimpleFoodstock(String name, String type, String unit_measurement, double quant_purchased, double value_payed) {
        super(name, type, unit_measurement);
        this.quant_purchased = quant_purchased;
        this.value_payed = value_payed;
    }

    /**
     * Método construtor dos insumos simples
     *
     * @param name nome do insumos simples
     * @param type tipo de insumo simples
     * @param unit_measurement unidade de medida do insumo simples
     * @param quant_purchased Quantidade comprada do insumo composto
     * @param value_payed valor pago pela quantidade
     * @param linkList lista de links especificando as ligações recebidas pelo insumo simples
     */
    public SimpleFoodstock(String name, String type, String unit_measurement, double quant_purchased, double value_payed, ArrayList<RecipeItem> linkList) {
        super(name, type, unit_measurement);
        this.quant_purchased = quant_purchased;
        this.value_payed = value_payed;
        this.setLinkedFrom(linkList);
    }

    public double getQuant_purchased() {
        return quant_purchased;
    }

    public void setQuant_purchased(double quant_purchased) {
        this.quant_purchased = quant_purchased;
    }

    public double getValue_payed() {
        return value_payed;
    }

    public void setValue_payed(double value_payed) {
        this.value_payed = value_payed;
    }

    public double getUnit_cost() {
        return unit_cost;
    }

    public void setUnit_cost(double unit_cost) {
        this.unit_cost = unit_cost;
    }
}
