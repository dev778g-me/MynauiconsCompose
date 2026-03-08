package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Refresh: ImageVector
    get() {
        if (_Refresh != null) {
            return _Refresh!!
        }
        _Refresh = ImageVector.Builder(
            name = "Outline.Refresh",
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
                moveTo(20.5f, 8f)
                curveToRelative(-1.392f, -3.179f, -4.823f, -5f, -8.522f, -5f)
                curveTo(7.299f, 3f, 3.453f, 6.552f, 3f, 11.1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.489f, 8.4f)
                horizontalLineToRelative(3.97f)
                arcTo(0.54f, 0.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.86f)
                verticalLineTo(3.9f)
                moveTo(3.5f, 16f)
                curveToRelative(1.392f, 3.179f, 4.823f, 5f, 8.522f, 5f)
                curveToRelative(4.679f, 0f, 8.525f, -3.552f, 8.978f, -8.1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7.511f, 15.6f)
                horizontalLineToRelative(-3.97f)
                arcToRelative(0.54f, 0.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.541f, 0.54f)
                verticalLineToRelative(3.96f)
            }
        }.build()

        return _Refresh!!
    }

@Suppress("ObjectPropertyName")
private var _Refresh: ImageVector? = null
