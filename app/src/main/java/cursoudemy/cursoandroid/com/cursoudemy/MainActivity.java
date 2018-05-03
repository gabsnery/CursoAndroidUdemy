package cursoudemy.cursoandroid.com.cursoudemy;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private SeekBar seekBar1;
    private SeekBar seekBar2;

    private String progressoSeekBar1;
    private String progressoSeekBar2;

    private TextView textoExibicao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar1    =   (SeekBar) findViewById(R.id.seekBar);
        seekBar2    =   (SeekBar) findViewById(R.id.seekBar2);
        seekBar2.setProgress(50);
        progressoSeekBar1   =   new String();
        progressoSeekBar2   =   new String();

        textoExibicao = (TextView) findViewById(R.id.textViewResultado);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textoExibicao.setText("Progresso:" + progress);
                progressoSeekBar1 = "Progresso:" + progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textoExibicao.setText((progressoSeekBar1)+'\n'+(progressoSeekBar2));
            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textoExibicao.setText("Progresso:" + progress);
                progressoSeekBar2 = "Progresso:" + (progress-50);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textoExibicao.setText((progressoSeekBar1)+'\n'+(progressoSeekBar2));
            }
        });
    }
}
