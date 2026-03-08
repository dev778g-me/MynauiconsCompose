package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.UmbrellaOff: ImageVector
    get() {
        if (_UmbrellaOff != null) {
            return _UmbrellaOff!!
        }
        _UmbrellaOff = ImageVector.Builder(
            name = "Outline.UmbrellaOff",
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
                moveTo(12f, 12f)
                verticalLineToRelative(6.773f)
                curveToRelative(0f, 3.519f, -5.5f, 3.519f, -5.5f, 0f)
                verticalLineTo(17.5f)
                moveTo(3f, 21f)
                lineToRelative(3.5f, -3.5f)
                moveTo(21f, 3f)
                lineToRelative(-2.447f, 2.447f)
                moveToRelative(0f, 0f)
                arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                curveToRelative(-2.486f, -2.13f, -3.878f, -2.13f, -6.364f, 0f)
                quadToRelative(-1.43f, -1.43f, -2.86f, -1.735f)
                moveToRelative(5.778f, -5.818f)
                lineTo(6.5f, 17.5f)
                moveTo(16f, 3.832f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveTo(6.477f, 3f, 2f, 7.477f, 2f, 13f)
                curveToRelative(2.2f, -1.886f, 3.544f, -2.103f, 5.547f, -0.65f)
            }
        }.build()

        return _UmbrellaOff!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaOff: ImageVector? = null
