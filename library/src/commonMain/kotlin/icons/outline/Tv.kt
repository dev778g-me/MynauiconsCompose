package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Tv: ImageVector
    get() {
        if (_Tv != null) {
            return _Tv!!
        }
        _Tv = ImageVector.Builder(
            name = "Outline.Tv",
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
                moveToRelative(12f, 7f)
                lineToRelative(6.632f, -4f)
                moveToRelative(-7.106f, 4f)
                lineTo(5.368f, 3f)
                moveTo(3f, 9.154f)
                curveTo(3f, 7.964f, 3.895f, 7f, 5f, 7f)
                horizontalLineToRelative(14f)
                curveToRelative(1.105f, 0f, 2f, 0.964f, 2f, 2.154f)
                verticalLineToRelative(9.692f)
                curveToRelative(0f, 1.19f, -0.895f, 2.154f, -2f, 2.154f)
                horizontalLineTo(5f)
                curveToRelative(-1.105f, 0f, -2f, -0.964f, -2f, -2.154f)
                close()
            }
        }.build()

        return _Tv!!
    }

@Suppress("ObjectPropertyName")
private var _Tv: ImageVector? = null
