package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Backpack: ImageVector
    get() {
        if (_Backpack != null) {
            return _Backpack!!
        }
        _Backpack = ImageVector.Builder(
            name = "Outline.Backpack",
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
                moveTo(8.786f, 5.333f)
                horizontalLineToRelative(6.428f)
                moveToRelative(-6.428f, 0f)
                curveTo(8.786f, 3.493f, 10.225f, 2f, 12f, 2f)
                reflectiveCurveToRelative(3.214f, 1.492f, 3.214f, 3.333f)
                moveToRelative(-6.428f, 0f)
                curveToRelative(-2.367f, 0f, -4.286f, 1.99f, -4.286f, 4.445f)
                verticalLineToRelative(10.666f)
                curveToRelative(0f, 0.86f, 0.96f, 1.556f, 2.143f, 1.556f)
                horizontalLineToRelative(10.714f)
                curveToRelative(1.184f, 0f, 2.143f, -0.696f, 2.143f, -1.556f)
                verticalLineTo(9.778f)
                curveToRelative(0f, -2.455f, -1.919f, -4.445f, -4.286f, -4.445f)
                moveTo(10.393f, 12f)
                horizontalLineToRelative(3.214f)
                curveToRelative(0.888f, 0f, 1.607f, -0.746f, 1.607f, -1.667f)
                curveToRelative(0f, -0.92f, -0.72f, -1.666f, -1.607f, -1.666f)
                horizontalLineToRelative(-3.214f)
                curveToRelative(-0.888f, 0f, -1.607f, 0.746f, -1.607f, 1.666f)
                reflectiveCurveTo(9.506f, 12f, 10.393f, 12f)
                moveToRelative(4.821f, 10f)
                verticalLineToRelative(-4.444f)
                curveToRelative(0f, -1.228f, -0.96f, -2.223f, -2.143f, -2.223f)
                horizontalLineTo(10.93f)
                curveToRelative(-1.184f, 0f, -2.143f, 0.995f, -2.143f, 2.223f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _Backpack!!
    }

@Suppress("ObjectPropertyName")
private var _Backpack: ImageVector? = null
