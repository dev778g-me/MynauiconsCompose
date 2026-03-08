package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Scissors: ImageVector
    get() {
        if (_Scissors != null) {
            return _Scissors!!
        }
        _Scissors = ImageVector.Builder(
            name = "Outline.Scissors",
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
                moveTo(11.79f, 12f)
                lineTo(7f, 8.855f)
                moveToRelative(14f, -2.903f)
                lineTo(7f, 15.145f)
                moveTo(8f, 6.92f)
                curveToRelative(0f, 1.337f, -1.12f, 2.42f, -2.5f, 2.42f)
                reflectiveCurveTo(3f, 8.256f, 3f, 6.919f)
                reflectiveCurveTo(4.12f, 4.5f, 5.5f, 4.5f)
                reflectiveCurveTo(8f, 5.583f, 8f, 6.92f)
                moveToRelative(0f, 10.162f)
                curveToRelative(0f, -1.336f, -1.12f, -2.42f, -2.5f, -2.42f)
                reflectiveCurveTo(3f, 15.745f, 3f, 17.081f)
                reflectiveCurveTo(4.12f, 19.5f, 5.5f, 19.5f)
                reflectiveCurveTo(8f, 18.417f, 8f, 17.08f)
                moveToRelative(13f, 0.968f)
                lineToRelative(-6.066f, -3.983f)
            }
        }.build()

        return _Scissors!!
    }

@Suppress("ObjectPropertyName")
private var _Scissors: ImageVector? = null
