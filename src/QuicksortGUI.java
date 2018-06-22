/**
 *
 * @author Jesus Ivan
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class QuicksortGUI extends JFrame {  
    // Declaracion de Variables
    private JRadioButton ascRadioChoice;
    private ButtonGroup buttonGroup1;
    private JTextField cadenaTextField;
    private JRadioButton descRadioChoice;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel resultLabel;
    private JLabel resultadoLabel;
    
    /** Creates new form QuicksortGUI */
    public QuicksortGUI() {
        initComponents();
        //Le damos un Tipo de Letra y Color al Label de Resultado.
        resultLabel.setFont(new java.awt.Font("SansSerif", 1, 14));
        resultLabel.setForeground(Color.RED);
        setLocationRelativeTo(null);      
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * initComponents es Declarado ya que la Interfaz(GUI) se Realizo en un 
     * JPanel Form y se tiene que Mandar a llamar.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cadenaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ascRadioChoice = new javax.swing.JRadioButton();
        descRadioChoice = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        resultadoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viruz Blog: QuickSort");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15));
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("INTRODUZCA UNA CADENA DE NÚMEROS QUE DESEE ORDENAR, SEPARADA POR ESPACIOS:");

 

        jLabel2.setText("ORDEN:");

        buttonGroup1.add(ascRadioChoice);
        ascRadioChoice.setSelected(true);
        ascRadioChoice.setText("ascendente");

        buttonGroup1.add(descRadioChoice);
        descRadioChoice.setText("descendente");

        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("RESULTADO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ascRadioChoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descRadioChoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(737, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(792, 792, 792))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                            .addComponent(cadenaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ascRadioChoice)
                        .addComponent(descRadioChoice))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(resultadoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /** Al Oprimir el Boton Toma lo que estan en el TextFied Manda A LLamar 
         * al metodo quicksort le pasa los datos y si se selecciona de forma 
         * descendente cambiara si no lo dejara en forma ascendente.
         */
        try {
            //Declaramos la clase Integer[] parseNumber();
            Integer[] arreglo = parseNumbers(cadenaTextField.getText());
            
            ArregloQuickSort.quicksort(arreglo);

            if (descRadioChoice.isSelected()) {
                ArregloQuickSort.reverseOrder(arreglo);
            }
            //StringBuilder.-Representa una cadena de caracteres modificable.
            StringBuilder resultado = new StringBuilder();

            for (Integer i : arreglo) {
                //apppend().-añade cualquier dato a una lista
                //se añade a resultado lo que vale en la posicion i y un espacio.
                resultado.append(i).append(" ");
            }
            //toString.-devuelve el valor numérico como una cadena
            resultLabel.setText(resultado.toString());
        } catch (RuntimeException e) {
            resultLabel.setText("La cadena introducida no es válida, los enteros " +
                    "deben estar separados por espacios");
        }
}//GEN-LAST:event_jButton1ActionPerformed


    private Integer[] parseNumbers(String numbers) {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(numbers);

        while (scanner.hasNext()) {
            lista.add(scanner.nextInt());
        }

        return lista.toArray(new Integer[]{});
    }
}