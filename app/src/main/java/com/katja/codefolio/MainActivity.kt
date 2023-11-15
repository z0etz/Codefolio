package com.katja.codefolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

//    val portfolioItemsList = listOf(
//
//    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        supportFragmentManager.commit{
            add(R.id.frameContent, PortfolioFragment())
        }

        binding.bPortfolio.setOnClickListener {
            supportFragmentManager.commit {
//                add(R.id.frameContent, PortfolioFragment())
//                val bundle = Bundle()
//                bundle.putString("msg", "Hello There")
//                val fPort = PortfolioFragment()
//                fPort.arguments = bundle
                supportFragmentManager.commit {
                    replace(R.id.frameContent, PortfolioFragment())
                }
            }

            binding.bProfile.setOnClickListener {
                supportFragmentManager.commit {
                    replace(R.id.frameContent, ProfileFragment())
                }
            }

//        val recyclerView: RecyclerView = binding.???

        }

    }
}