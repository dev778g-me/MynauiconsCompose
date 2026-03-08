package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Outline.Edit",
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
                moveTo(4f, 21f)
                horizontalLineToRelative(16f)
                moveTo(5.666f, 13.187f)
                arcTo(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14.797f)
                verticalLineTo(18f)
                horizontalLineToRelative(3.223f)
                curveToRelative(0.604f, 0f, 1.183f, -0.24f, 1.61f, -0.668f)
                lineToRelative(9.5f, -9.505f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.22f)
                lineToRelative(-0.938f, -0.94f)
                arcToRelative(2.277f, 2.277f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.222f, 0.001f)
                close()
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null
