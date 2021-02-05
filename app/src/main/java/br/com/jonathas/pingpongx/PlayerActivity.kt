package br.com.jonathas.pingpongx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PlayerActivity : AppCompatActivity() {

    companion object {
        val KEY_EXTRA_PLAY_ONE = "PLAYER1";
        val KEY_EXTRA_PLAY_TWO = "PLAYER2";
    }

    private lateinit var edPlayerOne: EditText
    private lateinit var edPlayerTwo: EditText
    private lateinit var btStart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        setupView()

        btStart.setOnClickListener{
            val nextScreen = Intent(this, MainActivity::class.java);
            nextScreen.putExtra(KEY_EXTRA_PLAY_ONE, edPlayerOne.text.toString());
            nextScreen.putExtra(KEY_EXTRA_PLAY_TWO, edPlayerTwo.text.toString());
            startActivity(nextScreen);
        }
    }

    private fun setupView() {
        edPlayerOne = findViewById(R.id.edPlayerOne)
        edPlayerTwo = findViewById(R.id.edPlayerTwo)

        btStart = findViewById(R.id.btStart)
    }
}
