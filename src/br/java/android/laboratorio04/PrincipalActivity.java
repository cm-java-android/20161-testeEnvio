package br.java.android.laboratorio04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PrincipalActivity extends Activity {

	Button botaoEnviar;
	EditText campoNomeUsuario;
	TextView textoRetorno;
	Button botaoMudarTela;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        
        campoNomeUsuario = (EditText)  findViewById(R.id.nomeEditText);
        botaoEnviar = (Button) findViewById(R.id.enviarButton);
        textoRetorno = (TextView) findViewById(R.id.retornoTextView);
        botaoMudarTela = (Button) findViewById(R.id.mudarTelaButton);
        
        botaoEnviar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				textoRetorno.setText(campoNomeUsuario.getText());
				
				
			}
		});
        
        botaoMudarTela.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent trocadorTela = new Intent(PrincipalActivity.this, SegundaTelaActivity.class); 
				startActivity(trocadorTela);
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
