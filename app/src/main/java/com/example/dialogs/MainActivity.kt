package com.example.dialogs

import android.app.AlertDialog
import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val b = findViewById<Button>(R.id.btnSubmit)
        val b2 = findViewById<Button>(R.id.btnSubmit2)
        b.setOnClickListener {

            /*val alertDialog = AlertDialog.Builder(this)
                .setTitle("Confirmación")
                .setMessage("¿Estás seguro de que deseas continuar?")
                .setPositiveButton("Aceptar") { dialog, _ ->

                    Toast.makeText(this, "NOMBRE AGREGADO EXITOSAMENTE",LENGTH_LONG).show()
                    dialog.dismiss()
                }
                .setNegativeButton("Cancelar") { dialog, _ ->
     
                    Toast.makeText(this, "CANCELACION EXITOSA",LENGTH_LONG).show()
                    dialog.dismiss()
                }
                .create()

            alertDialog.show()*/
            /*val items = arrayOf("Opción 1", "Opción 2", "Opción 3")
            AlertDialog.Builder(this)
                .setTitle("Elige una opción")
                .setItems(items) { dialog, which ->

                    Toast.makeText(this, "Seleccionaste: ${items[which]}", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                .show()*/
        }
       b2.setOnClickListener {
            val dialogView = layoutInflater.inflate(R.layout.custom_dialog, null)

            val dialog = AlertDialog.Builder(this)
                .setView(dialogView)
                .create()
           val btnSubmit = dialogView.findViewById<Button>(R.id.btnSubmit)

           btnSubmit.setOnClickListener {
               Toast.makeText(this, "Volviendo a la pantalla principal", Toast.LENGTH_SHORT).show()
               dialog.dismiss()
           }

           dialog.show()
            }
        }
}