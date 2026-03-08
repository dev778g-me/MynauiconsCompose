package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Confetti: ImageVector
    get() {
        if (_Confetti != null) {
            return _Confetti!!
        }
        _Confetti = ImageVector.Builder(
            name = "Outline.Confetti",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.675f, 20.971f)
                arcToRelative(0.508f, 0.508f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.65f, -0.637f)
                lineTo(5.615f, 9.21f)
                curveToRelative(0.12f, -0.374f, 0.6f, -0.475f, 0.862f, -0.183f)
                lineToRelative(7.756f, 7.544f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.212f, 0.82f)
                close()
                moveTo(10.894f, 9.276f)
                lineTo(13.3f, 6.66f)
                quadToRelative(1.925f, -2.091f, 0.48f, -3.66f)
                moveTo(8f, 5.25f)
                verticalLineToRelative(-0.5f)
                moveToRelative(12f, -0.25f)
                lineTo(20f, 4f)
                moveToRelative(0f, 9.5f)
                lineTo(20f, 13f)
                moveToRelative(-2f, 5.5f)
                lineTo(18f, 18f)
                moveToRelative(-4.219f, -5.586f)
                lineToRelative(2.406f, -2.615f)
                quadToRelative(2.407f, -2.616f, 4.813f, 0f)
            }
        }.build()

        return _Confetti!!
    }

@Suppress("ObjectPropertyName")
private var _Confetti: ImageVector? = null
