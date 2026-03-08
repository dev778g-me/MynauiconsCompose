package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Boat: ImageVector
    get() {
        if (_Boat != null) {
            return _Boat!!
        }
        _Boat = ImageVector.Builder(
            name = "Outline.Boat",
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
                moveToRelative(4.8f, 17.194f)
                lineToRelative(-0.597f, -3.343f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.326f, -2.246f)
                lineToRelative(0.171f, -0.058f)
                moveToRelative(0f, 0f)
                lineToRelative(5.658f, -1.92f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.284f, 0f)
                lineToRelative(5.658f, 1.92f)
                moveToRelative(-12.6f, 0f)
                verticalLineToRelative(-3.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(2.5f)
                moveToRelative(8.1f, 5.8f)
                lineToRelative(0.171f, 0.058f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.326f, 2.246f)
                lineToRelative(-0.597f, 3.342f)
                moveToRelative(-0.9f, -5.646f)
                verticalLineToRelative(-3.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-2.5f)
                moveToRelative(-3.6f, 0f)
                horizontalLineToRelative(3.6f)
                moveToRelative(-3.6f, 0f)
                verticalLineTo(4.8f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.6f, 0f)
                verticalLineToRelative(0.947f)
                moveTo(3f, 20.398f)
                curveToRelative(0.647f, 0.658f, 2.222f, 0.844f, 3.725f, 0.217f)
                curveToRelative(1.032f, -0.43f, 2.336f, -0.441f, 3.391f, -0.071f)
                arcToRelative(5.83f, 5.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.768f, 0f)
                curveToRelative(1.055f, -0.37f, 2.359f, -0.36f, 3.39f, 0.07f)
                curveToRelative(1.504f, 0.628f, 3.08f, 0.442f, 3.726f, -0.216f)
            }
        }.build()

        return _Boat!!
    }

@Suppress("ObjectPropertyName")
private var _Boat: ImageVector? = null
