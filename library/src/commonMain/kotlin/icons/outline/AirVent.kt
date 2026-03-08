package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AirVent: ImageVector
    get() {
        if (_AirVent != null) {
            return _AirVent!!
        }
        _AirVent = ImageVector.Builder(
            name = "Outline.AirVent",
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
                moveTo(18.346f, 4.5f)
                horizontalLineTo(5.654f)
                curveToRelative(-0.629f, 0f, -1.154f, 0.525f, -1.154f, 1.154f)
                verticalLineToRelative(5.77f)
                curveToRelative(0f, 0.628f, 0.525f, 1.153f, 1.154f, 1.153f)
                horizontalLineToRelative(12.692f)
                curveToRelative(0.629f, 0f, 1.154f, -0.525f, 1.154f, -1.154f)
                verticalLineToRelative(-5.77f)
                curveToRelative(0f, -0.628f, -0.525f, -1.153f, -1.154f, -1.153f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.615f, 12.577f)
                verticalLineToRelative(-2.308f)
                curveToRelative(0f, -0.628f, -0.525f, -1.154f, -1.153f, -1.154f)
                horizontalLineTo(8.537f)
                curveToRelative(-0.628f, 0f, -1.153f, 0.526f, -1.153f, 1.154f)
                verticalLineToRelative(2.308f)
                moveToRelative(-0.577f, 5.77f)
                curveToRelative(1.64f, 0f, 1.73f, -1.604f, 1.73f, -2.886f)
                moveToRelative(8.654f, 2.885f)
                curveToRelative(-1.64f, 0f, -1.73f, -1.603f, -1.73f, -2.885f)
                moveTo(12f, 19.5f)
                verticalLineToRelative(-4.039f)
            }
        }.build()

        return _AirVent!!
    }

@Suppress("ObjectPropertyName")
private var _AirVent: ImageVector? = null
