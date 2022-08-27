package com.pucpr.mimificador

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class MimimiController {

    @GetMapping("mimimi")
    @ResponseBody
    fun getSorted(
        @RequestParam(name="frase", required=false, defaultValue = "Minha TV é maior do que o seu cinema") frase : String
    ) : String {

        return frase.replace("""[aeou]""".toRegex(), "i")
        
    }

}