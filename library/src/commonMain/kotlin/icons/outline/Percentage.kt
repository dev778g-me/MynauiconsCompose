package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Percentage: ImageVector
    get() {
        if (_Percentage != null) {
            return _Percentage!!
        }
        _Percentage = ImageVector.Builder(
            name = "Outline.Percentage",
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
                moveTo(19f, 5f)
                lineTo(5f, 19f)
                moveToRelative(12.5f, 1f)
                curveToRelative(1.667f, 0f, 2.5f, -0.857f, 2.5f, -3f)
                reflectiveCurveToRelative(-0.833f, -3f, -2.5f, -3f)
                reflectiveCurveToRelative(-2.5f, 0.857f, -2.5f, 3f)
                reflectiveCurveToRelative(0.833f, 3f, 2.5f, 3f)
                moveToRelative(-11f, -10f)
                curveTo(8.167f, 10f, 9f, 9.143f, 9f, 7f)
                reflectiveCurveToRelative(-0.833f, -3f, -2.5f, -3f)
                reflectiveCurveTo(4f, 4.857f, 4f, 7f)
                reflectiveCurveToRelative(0.833f, 3f, 2.5f, 3f)
            }
        }.build()

        return _Percentage!!
    }

@Suppress("ObjectPropertyName")
private var _Percentage: ImageVector? = null
