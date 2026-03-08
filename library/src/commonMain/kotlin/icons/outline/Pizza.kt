package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pizza: ImageVector
    get() {
        if (_Pizza != null) {
            return _Pizza!!
        }
        _Pizza = ImageVector.Builder(
            name = "Outline.Pizza",
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
                moveTo(6.234f, 16.925f)
                arcToRelative(15.98f, 15.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.69f, -10.691f)
                moveTo(7.582f, 7.58f)
                arcToRelative(18.76f, 18.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.33f, -4.53f)
                curveToRelative(0.536f, -0.18f, 1.103f, 0.136f, 1.265f, 0.678f)
                lineToRelative(4.779f, 15.928f)
                arcToRelative(1.042f, 1.042f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.298f, 1.298f)
                lineTo(3.73f, 16.176f)
                curveToRelative(-0.542f, -0.162f, -0.858f, -0.729f, -0.679f, -1.266f)
                arcToRelative(18.76f, 18.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.53f, -7.33f)
                moveTo(11f, 15f)
                lineToRelative(0.354f, 0.354f)
                moveTo(15f, 11f)
                lineToRelative(0.354f, 0.354f)
                moveTo(16f, 16f)
                lineToRelative(0.354f, 0.354f)
            }
        }.build()

        return _Pizza!!
    }

@Suppress("ObjectPropertyName")
private var _Pizza: ImageVector? = null
