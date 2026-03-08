package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Scan: ImageVector
    get() {
        if (_Scan != null) {
            return _Scan!!
        }
        _Scan = ImageVector.Builder(
            name = "Outline.Scan",
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
                moveTo(3.114f, 7.5f)
                curveToRelative(0.144f, -1.463f, 0.47f, -2.447f, 1.204f, -3.182f)
                curveTo(5.636f, 3f, 7.758f, 3f, 12f, 3f)
                reflectiveCurveToRelative(6.364f, 0f, 7.682f, 1.318f)
                curveToRelative(0.735f, 0.735f, 1.06f, 1.72f, 1.204f, 3.182f)
                moveToRelative(0f, 9f)
                curveToRelative(-0.144f, 1.463f, -0.47f, 2.447f, -1.204f, 3.182f)
                curveTo(18.364f, 21f, 16.242f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-6.364f, 0f, -7.682f, -1.318f)
                curveToRelative(-0.735f, -0.735f, -1.06f, -1.72f, -1.204f, -3.182f)
                moveTo(3f, 12f)
                horizontalLineToRelative(0.5f)
                moveToRelative(8.25f, 0f)
                horizontalLineToRelative(0.5f)
                moveToRelative(-5f, 0f)
                horizontalLineToRelative(0.5f)
                moveToRelative(8.5f, 0f)
                horizontalLineToRelative(0.5f)
                moveToRelative(3.75f, 0f)
                horizontalLineToRelative(0.5f)
            }
        }.build()

        return _Scan!!
    }

@Suppress("ObjectPropertyName")
private var _Scan: ImageVector? = null
