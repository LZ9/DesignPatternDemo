package com.lodz.android.designpatterndemo.designpattern.facade;

import com.lodz.android.designpatterndemo.designpattern.facade.stock.NationalDebt;
import com.lodz.android.designpatterndemo.designpattern.facade.stock.Realty;
import com.lodz.android.designpatterndemo.designpattern.facade.stock.StockA;
import com.lodz.android.designpatterndemo.designpattern.facade.stock.StockB;
import com.lodz.android.designpatterndemo.designpattern.facade.stock.StockC;

/**
 * 基金
 * Created by zhouL on 2016/12/5.
 */
public class Fund {

    private StockA mStockA;
    private StockB mStockB;
    private StockC mStockC;
    private NationalDebt mNationalDebt;
    private Realty mRealty;

    public Fund() {
        mStockA = new StockA();
        mStockB = new StockB();
        mStockC = new StockC();
        mNationalDebt = new NationalDebt();
        mRealty = new Realty();
    }

    public void buyFund(){
        mStockA.buy();
        mStockB.buy();
        mStockC.buy();
        mNationalDebt.buy();
        mRealty.buy();

    }

    public void sellFund(){
        mStockA.sell();
        mStockB.sell();
        mStockC.sell();
        mNationalDebt.sell();
        mRealty.sell();
    }

}
