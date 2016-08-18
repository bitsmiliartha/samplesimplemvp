/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Toolkit;

/**
 *
 * @author eko
 */
public class ScreenUtil {

    public static void setCursorThinking(Component component) {
        component.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Toolkit.getDefaultToolkit().sync();
    }

    public static void setCursorDefault(Component component) {
        component.setCursor(Cursor.getDefaultCursor());
        Toolkit.getDefaultToolkit().sync();
    }
}
