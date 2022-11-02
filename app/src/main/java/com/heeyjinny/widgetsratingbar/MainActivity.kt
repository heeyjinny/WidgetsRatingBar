package com.heeyjinny.widgetsratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heeyjinny.widgetsratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //레이팅바 리스너 사용 : setOnRatingBarChangeListener {}
        //두 번째 파라미터 : 현재별점
        //세 번쨰 파라미터 : 사용자 입력 여부
        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->

            //인터페이스 메서드를 생성한 시크바와 구조가 다르기 때문에 중괄호 안에 식 바로 사용가능
            binding.textView.text="$fl"

        }

        //레이팅바 직접 코드로 값 입력 가능
        //binding.ratingBar.rating=2.5F
        
    }//onCreate

}//MainActivity