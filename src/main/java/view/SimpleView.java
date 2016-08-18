/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author eko
 */
public interface SimpleView {

    public default void showLoading(){
        System.out.println("lagi loading cak");
    }

    public void hideLoading();

    public void indicateProcessRunning(int progress);
}
