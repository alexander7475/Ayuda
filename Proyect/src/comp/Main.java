package comp;

import javax.swing.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLJPanel;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Triángulo con JOGL");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Crea un GLJPanel
            GLJPanel gljPanel = new GLJPanel();
            gljPanel.addGLEventListener(new TriangleRenderer());

            frame.add(gljPanel);
            frame.setVisible(true);
        });
    }
}

class TriangleRenderer implements GLEventListener {
    @Override
    public void init(GLAutoDrawable drawable) {
        // Configuración inicial de OpenGL
        GL2 gl = drawable.getGL().getGL2();
        gl.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        // Dibuja el triángulo
        GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        gl.glBegin(GL2.GL_TRIANGLE_FAN);
        gl.glScalef(10, 10, 10);
        gl.glColor3f(1.0f, 0.0f, 0.0f); // Rojo
        gl.glVertex2f(0.0f, 0.5f); // Vértice superior

        gl.glColor3f(0.0f, 1.0f, 0.0f); // Verde
        gl.glVertex2f(-0.5f, -0.5f); // Vértice inferior izquierdo

        gl.glColor3f(0.0f, 0.0f, 1.0f); // Azul
        gl.glVertex2f(0.5f, -0.5f); // Vértice inferior derecho
        gl.glEnd();

        gl.glFlush();
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // Ajusta la vista si se cambia el tamaño de la ventana
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // Limpieza al cerrar la aplicación
    }

}

