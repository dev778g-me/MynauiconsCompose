package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Outline.Ruler",
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
                moveToRelative(5.914f, 12f)
                lineToRelative(2.282f, 2.283f)
                moveToRelative(0.76f, -5.326f)
                lineToRelative(2.283f, 2.282f)
                moveTo(12f, 5.914f)
                lineToRelative(2.283f, 2.282f)
                moveToRelative(-9.74f, 5.174f)
                lineToRelative(8.826f, -8.826f)
                curveToRelative(0.853f, -0.852f, 1.28f, -1.278f, 1.77f, -1.438f)
                curveToRelative(0.433f, -0.14f, 0.898f, -0.14f, 1.33f, 0f)
                curveToRelative(0.491f, 0.16f, 0.917f, 0.586f, 1.768f, 1.437f)
                lineToRelative(1.22f, 1.219f)
                curveToRelative(0.852f, 0.852f, 1.278f, 1.28f, 1.438f, 1.77f)
                curveToRelative(0.14f, 0.433f, 0.14f, 0.897f, 0f, 1.33f)
                curveToRelative(-0.16f, 0.49f, -0.586f, 0.917f, -1.438f, 1.77f)
                lineToRelative(-8.826f, 8.826f)
                curveToRelative(-0.853f, 0.852f, -1.28f, 1.278f, -1.77f, 1.438f)
                curveToRelative(-0.433f, 0.14f, -0.897f, 0.14f, -1.33f, 0f)
                curveToRelative(-0.49f, -0.16f, -0.918f, -0.586f, -1.77f, -1.439f)
                lineToRelative(-1.22f, -1.218f)
                curveToRelative(-0.85f, -0.852f, -1.276f, -1.277f, -1.436f, -1.769f)
                arcToRelative(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.33f)
                curveToRelative(0.16f, -0.49f, 0.586f, -0.917f, 1.438f, -1.77f)
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
