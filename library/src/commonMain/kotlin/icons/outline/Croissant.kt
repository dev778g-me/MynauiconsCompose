package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Croissant: ImageVector
    get() {
        if (_Croissant != null) {
            return _Croissant!!
        }
        _Croissant = ImageVector.Builder(
            name = "Outline.Croissant",
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
                moveTo(10.803f, 9.997f)
                lineTo(9.75f, 7.69f)
                curveTo(9.48f, 7.032f, 9.12f, 6.6f, 8.4f, 6.6f)
                moveToRelative(0f, 0f)
                horizontalLineTo(5.25f)
                curveTo(3.711f, 6.6f, 3f, 7.05f, 3f, 8.85f)
                curveToRelative(0.075f, 1.614f, 0.827f, 3.266f, 1.915f, 4.462f)
                moveTo(8.4f, 6.6f)
                curveToRelative(0f, -1.395f, 0.216f, -3.6f, -1.8f, -3.6f)
                curveToRelative(-1.8f, 0f, -2.25f, 2.029f, -2.25f, 3.676f)
                moveTo(14f, 13.21f)
                lineToRelative(2.311f, 1.04f)
                curveToRelative(0.657f, 0.27f, 1.089f, 0.63f, 1.089f, 1.35f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.15f)
                curveToRelative(0f, 1.539f, -0.45f, 2.25f, -2.25f, 2.25f)
                curveToRelative(-1.614f, -0.076f, -3.264f, -0.824f, -4.459f, -1.912f)
                moveTo(17.4f, 15.6f)
                curveToRelative(1.395f, 0f, 3.6f, -0.216f, 3.6f, 1.8f)
                curveToRelative(0f, 1.8f, -2.029f, 2.25f, -3.676f, 2.25f)
                moveTo(5.34f, 13f)
                lineToRelative(5.211f, -2.89f)
                curveToRelative(1.701f, -0.945f, 4.311f, 1.602f, 3.339f, 3.34f)
                lineToRelative(-2.898f, 5.228f)
                curveTo(9.12f, 22.044f, 1.911f, 14.908f, 5.34f, 13f)
            }
        }.build()

        return _Croissant!!
    }

@Suppress("ObjectPropertyName")
private var _Croissant: ImageVector? = null
