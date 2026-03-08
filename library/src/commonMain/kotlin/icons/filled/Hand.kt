package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Hand: ImageVector
    get() {
        if (_Hand != null) {
            return _Hand!!
        }
        _Hand = ImageVector.Builder(
            name = "Filled.Hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.594f, 4.44f)
                arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.063f, -0.19f)
                curveToRelative(1.176f, 0.023f, 2.521f, 0.832f, 2.521f, 2.462f)
                verticalLineToRelative(0.323f)
                curveToRelative(0.34f, -0.133f, 0.701f, -0.191f, 1.05f, -0.184f)
                curveToRelative(1.177f, 0.022f, 2.522f, 0.83f, 2.522f, 2.46f)
                verticalLineToRelative(4.4f)
                curveToRelative(0f, 3.843f, -2.761f, 6.463f, -5.977f, 7.509f)
                curveToRelative(-3.202f, 1.041f, -7.092f, 0.609f, -9.582f, -1.884f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-3.214f, -3.24f)
                lineToRelative(-0.027f, -0.028f)
                curveToRelative(-1.038f, -1.16f, -0.82f, -2.85f, 0.009f, -3.828f)
                curveToRelative(0.435f, -0.515f, 1.078f, -0.885f, 1.855f, -0.875f)
                quadToRelative(0.491f, 0.006f, 0.976f, 0.21f)
                verticalLineTo(6.711f)
                curveToRelative(0f, -0.81f, 0.332f, -1.458f, 0.864f, -1.887f)
                curveToRelative(0.513f, -0.413f, 1.162f, -0.586f, 1.773f, -0.574f)
                curveToRelative(0.375f, 0.006f, 0.76f, 0.083f, 1.118f, 0.236f)
                curveToRelative(0.053f, -0.693f, 0.352f, -1.259f, 0.816f, -1.65f)
                curveToRelative(0.495f, -0.42f, 1.128f, -0.598f, 1.726f, -0.586f)
                curveToRelative(1.109f, 0.02f, 2.368f, 0.74f, 2.509f, 2.19f)
            }
        }.build()

        return _Hand!!
    }

@Suppress("ObjectPropertyName")
private var _Hand: ImageVector? = null
