package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 25-10-2017.
 */
class Project_Card_Info_Collector {
    private var Title : String? = null
    private var text: String? = null
    private var team : String? = null
//    private var Image: String? = null
//    private var chips : ArrayList<String>? = null

    constructor(Title: String?, Discription: String?, team : String?/*Image: String?,chips:ArrayList<String>*/) {
        this.Title = Title
        this.text = Discription
        this.team = team
//        this.Image = Image
//        this.chips = chips
    }

    constructor(){}

    fun getTitle():String{
        return "${this.Title}"
    }
    fun getText():String{
        return "${this.text}"
    }
    fun getTeam():String{
        return "$(this.team)"
    }
    fun setTitle(title : String){
        Title = title
    }
    fun setText(text : String){
        this.text = text
    }
    fun setTeam(team : String){
        this.team = team
    }
//    fun getImage():String{
//        return "${this.Image}"
//    }
//    fun getChips():ArrayList<String>{
//        return chips!!
//    }

}