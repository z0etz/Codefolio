// Tanken var att bygga appen enl. MVP, men jag lyckas inte riktigt förstå hur det ska göras med
// fragment, så jag tar gärna feedback på det.

package com.katja.codefolio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.katja.codefolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            add(R.id.frameContent, PortfolioFragment())
        }

        binding.bPortfolio.setOnClickListener {
            supportFragmentManager.commit {
                    replace(R.id.frameContent, PortfolioFragment())
                }
            }

        binding.bProfile.setOnClickListener {
            supportFragmentManager.commit {
                replace(R.id.frameContent, ProfileFragment())
            }
        }

    }

}
