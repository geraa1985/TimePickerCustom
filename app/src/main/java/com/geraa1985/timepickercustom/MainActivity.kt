package com.geraa1985.timepickercustom

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {

    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<MaterialButton>(R.id.btn_dialog)

        btn.setOnClickListener {
            val mBottomSheetDialog = BottomSheetDialog(this, R.style.SheetDialog)
            val sheetView: View = layoutInflater.inflate(R.layout.fragment_history_bottom_sheet, null)
            val picker = sheetView.findViewById<NumberPicker>(R.id.num_picker)
            val values = resources.getStringArray(R.array.time)
            picker.minValue = 0
            picker.maxValue = values.size - 1
            picker.displayedValues = values
            mBottomSheetDialog.setContentView(sheetView)
            mBottomSheetDialog.show()
        }
    }

}