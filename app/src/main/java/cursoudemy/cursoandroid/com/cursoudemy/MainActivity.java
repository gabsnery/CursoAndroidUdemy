package cursoudemy.cursoandroid.com.cursoudemy;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private CheckBox checkCao;
    private CheckBox checkGato;
    private CheckBox checkPapagaio;
    private CheckBox checkHamster;

    private Button   botaoMostrar;
    private TextView textoExibicao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkCao        =   (CheckBox) findViewById(R.id.checkBoxCachorroId) ;
        checkGato       =   (CheckBox) findViewById(R.id.checkBoxGatoId)   ;
        checkPapagaio   =   (CheckBox) findViewById(R.id.checkBoxPapagaioId);
        checkHamster    =   (CheckBox) findViewById(R.id.checkBoxHamsterId);

        botaoMostrar = (Button) findViewById(R.id.buttonMostrarId);
        textoExibicao = (TextView) findViewById(R.id.TextoExibicaoId);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionados = "";

                if (checkCao.isChecked())
                itensSelecionados +="Item: " + checkCao.getText();
                if (checkGato.isChecked())
                itensSelecionados +="\nItem: " + checkGato.getText();
                if (checkHamster.isChecked())
                itensSelecionados +="\nItem: " + checkHamster.getText();
                if (checkPapagaio.isChecked())
                itensSelecionados +="\nItem: " + checkPapagaio.getText();

                textoExibicao.setText(itensSelecionados);
                Toast.makeText(getApplicationContext(),itensSelecionados,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
