package com.chugunov.composition.presentation

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.chugunov.composition.R
import com.chugunov.composition.domain.entity.GameResult

@BindingAdapter("requiredAnswers")
fun bindRequiredAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_score),
        count
    )
}

@BindingAdapter("scoreAnswers")
fun bindCountOfRightAnswers(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.score_answers),
        count)
}

@BindingAdapter("requiredPercent")
fun bindRequiredPercent(textView: TextView, count: Int) {
    textView.text = String.format(
        textView.context.getString(R.string.required_percentage),
        count)
}
@BindingAdapter("scorePercentage")
fun bindScorePercentage(textView: TextView, gameResult: GameResult) {
    textView.text = String.format(
        textView.context.getString(R.string.score_percentage),
        getPercentOfRightAnswers(gameResult)
    )
}

private fun getPercentOfRightAnswers(gameResult: GameResult) = with(gameResult) {
    if (countOfQuestions == 0) {
        0
    } else {
        ((countOfRightAnswers / countOfQuestions.toDouble())* 100).toInt()
    }
}

@BindingAdapter("emojiResult")
fun bindEmoji(imageView: ImageView, winner: Boolean) {
    imageView.setImageResource(getSmileResId(winner))
}

private fun getSmileResId(winner: Boolean): Int {
    return if (winner) {
        R.drawable.ic_smile
    } else {
        R.drawable.ic_sad
    }
}