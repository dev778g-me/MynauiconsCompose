package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Tornado: ImageVector
    get() {
        if (_Tornado != null) {
            return _Tornado!!
        }
        _Tornado = ImageVector.Builder(
            name = "Outline.Tornado",
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
                moveTo(12f, 4.5f)
                curveToRelative(5.522f, 0f, 10f, 0.72f, 10f, 1.605f)
                curveTo(22f, 8.5f, 2f, 8.5f, 2f, 6.105f)
                curveTo(2f, 5.55f, 3.764f, 5.06f, 6.444f, 4.771f)
                moveTo(3.111f, 9.85f)
                curveToRelative(4.895f, 1.69f, 12.957f, 2.074f, 17.778f, 0f)
                moveTo(7.556f, 16.272f)
                curveToRelative(2.446f, 0.937f, 6.442f, 0.937f, 8.888f, 0f)
                moveToRelative(-8.888f, 2.676f)
                curveToRelative(2.123f, 0.697f, 4.476f, 0.67f, 6.666f, 0.273f)
                moveToRelative(-8.889f, -6.16f)
                curveToRelative(3.556f, 1.927f, 11.292f, 1.279f, 13.334f, 0f)
            }
        }.build()

        return _Tornado!!
    }

@Suppress("ObjectPropertyName")
private var _Tornado: ImageVector? = null
