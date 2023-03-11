package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // Variaveis usadas para a contagem
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // obtendo uma referencia ao TextView usando o ID definido no arquivo XML
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    // Método showToast() referente ao manipulador de cliques presente no activity_main em button_top
    // A lógica a seguir serve muito bem para mostrar pequenas notificações na tela
    public void showToast(View view) {

        // O método makeText() está presente na linha 87

        // https://developer.android.com/codelabs/android-training-layout-editor-part-a?index=..%2F..%2Fandroid-training&authuser=4#7
        // 1ª passamos o contexto do aplicativo. A explicação completa está na documentação. "this".
        // 2ª passamos a mensagem a ser exibida, como um recurso de string (que está presente no arquivo string.xml).

        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        toast.show();
    }

    // Método showToast() referente ao manipulador de cliques presente no activity_main em button_top
    // Lógica usada para o contador
    public void countUp(View view) {
        mCount++;

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}