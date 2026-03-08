package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Shovel: ImageVector
    get() {
        if (_Shovel != null) {
            return _Shovel!!
        }
        _Shovel = ImageVector.Builder(
            name = "Outline.Shovel",
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
                moveTo(8.512f, 3.5f)
                lineTo(3.5f, 8.482f)
                moveToRelative(2.506f, -2.491f)
                lineToRelative(9.035f, 8.946f)
                moveToRelative(1.229f, -3.197f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.375f, 0f)
                curveToRelative(6.324f, 6.261f, 1.148f, 12.687f, -5.831f, 5.774f)
                arcToRelative(0.967f, 0.967f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.36f)
                lineToRelative(2.228f, -2.207f)
                close()
            }
        }.build()

        return _Shovel!!
    }

@Suppress("ObjectPropertyName")
private var _Shovel: ImageVector? = null
