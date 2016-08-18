/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import javax.swing.SwingWorker;
import view.SimpleView;

/**
 *
 * @author eko
 */
public class SimplePresenter {

    private final SimpleView view;

    public SimplePresenter(SimpleView view) {
        this.view = view;
    }

    public void doProcess() {
        view.showLoading();
        Worker worker = new Worker();
        worker.execute();
    }

    class Worker extends SwingWorker<Object, Object> {

        @Override
        protected Object doInBackground() throws Exception {
            for (int i = 0; i < 10; i++) {
                view.indicateProcessRunning(i);
                Thread.sleep(2000);
            }

            return null;
        }

        @Override
        protected void done() {
            view.hideLoading();
        }

    }
}
